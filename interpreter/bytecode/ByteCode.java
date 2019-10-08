package interpreter.bytecode;
import interpreter.VirtualMachine;
import java.util.ArrayList;

/**
 * Abstract class for all ByteCode objects
 *
 * @author Malkam Golden
 */
public abstract class ByteCode {

    // used to initialize the specific ByteCode object
    public abstract void init(ArrayList<String> id);

    // used to perform Bytecode action
    public abstract void execute(VirtualMachine virMac);

}