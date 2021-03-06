/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.inf.chessgame.generator;

import com.google.common.collect.Iterators;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import uk.ac.kcl.inf.chessgame.chessGame.CellDisplay;
import uk.ac.kcl.inf.chessgame.chessGame.CellState;
import uk.ac.kcl.inf.chessgame.chessGame.ChessProgram;
import uk.ac.kcl.inf.chessgame.chessGame.FieldSpecification;
import uk.ac.kcl.inf.chessgame.chessGame.Statements;
import uk.ac.kcl.inf.chessgame.chessGame.Transition;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ChessGameGenerator extends AbstractGenerator {
  private static class Environment {
    private int counter = 0;
    
    public CharSequence getFreshVarName() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("i");
      int _plusPlus = this.counter++;
      _builder.append(_plusPlus);
      return _builder;
    }
    
    public int exit() {
      return this.counter--;
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final ChessProgram model = ((ChessProgram) _head);
    fsa.generateFile(this.deriveTargetFileNameFor(model, resource), this.generate(model));
    final String className = this.deriveClassName(resource);
    fsa.generateFile((className + ".java"), this.doGenerateClass(model, className));
  }
  
  public String deriveClassName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origFilename = resource.getURI().lastSegment();
      String _firstUpper = StringExtensions.toFirstUpper(origFilename.substring(0, origFilename.indexOf(".")));
      _xblockexpression = (_firstUpper + "ChessGame");
    }
    return _xblockexpression;
  }
  
  public String deriveTargetFileNameFor(final ChessProgram program, final Resource resource) {
    return resource.getURI().appendFileExtension("txt").lastSegment();
  }
  
  public CharSequence generate(final ChessProgram program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Program contains:");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("- ");
    int _size = IteratorExtensions.size(Iterators.<CellState>filter(program.eAllContents(), CellState.class));
    _builder.append(_size);
    _builder.append(" cell states");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_1 = IteratorExtensions.size(Iterators.<CellDisplay>filter(program.eAllContents(), CellDisplay.class));
    _builder.append(_size_1);
    _builder.append(" cell displays");
    _builder.newLineIfNotEmpty();
    _builder.append("- ");
    int _size_2 = IteratorExtensions.size(Iterators.<Transition>filter(program.eAllContents(), Transition.class));
    _builder.append(_size_2);
    _builder.append(" transitions");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence doGenerateClass(final ChessProgram program, final String className) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    _builder.append(className);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("public static void main (){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ChessGameFrame cg = new ChessGameFrame();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ChessGame c = new ChessGame(cg) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public void run() {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    final Function1<Statements, String> _function = (Statements it) -> {
      ChessGameGenerator.Environment _environment = new ChessGameGenerator.Environment();
      return this.generateJavaStatement(it, _environment);
    };
    String _join = IterableExtensions.join(ListExtensions.<Statements, String>map(program.getStates(), _function), "\n");
    _builder.append(_join, "\t\t\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("};");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("c.run();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected String _generateJavaStatement(final Statements stmt, final ChessGameGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final FieldSpecification stmt, final ChessGameGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public createField{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("width = ");
    int _width = stmt.getWidth();
    _builder.append(_width, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("height = ");
    int _height = stmt.getHeight();
    _builder.append(_height, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _generateJavaStatement(final CellState stmt, final ChessGameGenerator.Environment env) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public createCellState ");
    String _name = stmt.getName();
    _builder.append(_name);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("display{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("text = ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateJavaStatement(final Statements stmt, final ChessGameGenerator.Environment env) {
    if (stmt instanceof CellState) {
      return _generateJavaStatement((CellState)stmt, env);
    } else if (stmt instanceof FieldSpecification) {
      return _generateJavaStatement((FieldSpecification)stmt, env);
    } else if (stmt != null) {
      return _generateJavaStatement(stmt, env);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(stmt, env).toString());
    }
  }
}
