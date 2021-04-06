/*
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uk.ac.kcl.inf.chessgame.chessGame.ChessProgram
import uk.ac.kcl.inf.chessgame.chessGame.CellState
import uk.ac.kcl.inf.chessgame.chessGame.CellDisplay
import uk.ac.kcl.inf.chessgame.chessGame.Transition
import uk.ac.kcl.inf.chessgame.chessGame.Statements
import uk.ac.kcl.inf.chessgame.chessGame.FieldSpecification

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ChessGameGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
	val model = resource.contents.head as ChessProgram
		
	fsa.generateFile(deriveTargetFileNameFor(model, resource), model.generate)
		
	val className = resource.deriveClassName
		
	fsa.generateFile(className + '.java', model.doGenerateClass(className))
	}
	
	def deriveClassName(Resource resource) {
		val origFilename = resource.URI.lastSegment
		
		origFilename.substring(0, origFilename.indexOf('.')).toFirstUpper + 'ChessGame'	
	}
	
	def deriveTargetFileNameFor(ChessProgram program, Resource resource) {
			resource.URI.appendFileExtension('txt').lastSegment
	}
	
	def generate(ChessProgram program)'''
		Program contains:
		    
		- «program.eAllContents.filter(CellState).size» cell states
		- «program.eAllContents.filter(CellDisplay).size» cell displays
		- «program.eAllContents.filter(Transition).size» transitions
		    
	'''
	def doGenerateClass(ChessProgram program, String className)'''
		public class «className» {
			public static void main (){
				ChessGameFrame cg = new ChessGameFrame();
				
				ChessGame c = new ChessGame(cg) {
					@Override
					public void run() {
						«program.states.map[generateJavaStatement(new Environment)].join('\n')»
						
					}
				};
				
				c.run();
				
		    }
		}
	'''
	
		private static class Environment{
		var int counter = 0
		
		def getFreshVarName() '''i«counter++»'''
		
		def exit() { counter--}
	}
	
	dispatch def String generateJavaStatement(Statements stmt, Environment env)''''''
	dispatch def String generateJavaStatement(FieldSpecification stmt, Environment env)'''
	public createField{
		width = «stmt.width»;
		height = «stmt.height»;
	}
	'''
	dispatch def String generateJavaStatement(CellState stmt, Environment env)'''
	public createCellState «stmt.name»{
		display{
			
			text = 
		}
	}
	'''
//	dispatch def String generateJavaStatement(CellState stmt, Environment env)'''
//	createCellState «stmt.name»{
//		display{
//			text = «stmt.display.text»
//		}
//		transitions{
//			click «stmt.transitions» and goto «stmt»
//		}
//	}
//	'''
//	dispatch def String generateJavaExpression(CellState exp)'''
//	«exp.name»
//	'''
//	dispatch def String generateJavaExpression(CellDisplay exp)'''
//	«exp.text»
//	'''
}
