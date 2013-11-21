import com.cycling74.max.*;
import com.cycling74.msp.*;
public class Granuvolver extends MSPPerformer
{

	private static final String[] INLET_ASSIST = new String[]{
		"inlet 1 help"
	};
	private static final String[] OUTLET_ASSIST = new String[]{
		"outlet 1 help"
	};
	
	public Granuvolver(Atom[] args)
	{
		declareInlets(new int[]{SIGNAL, SIGNAL, DataTypes.ALL});
		declareOutlets(new int[]{SIGNAL, SIGNAL, DataTypes.ALL});
		
		setInletAssist(INLET_ASSIST);
		setOutletAssist(OUTLET_ASSIST);

	}
    

    public void dspsetup(MSPSignal[] in, MSPSignal[] out) 
    {

    }

    public void perform(MSPSignal[] in, MSPSignal[] out)
    {
    	float[] in1 = in[0].vec;
    	float[] in2 = in[1].vec;
    	float[] out1 = out[0].vec;
    	float[] out2 = out[1].vec;
    	int vec_size = in[0].n;

    	for(int i = 0; i < vec_size; i++) {
    		out1[i] = in1[i];
    		out2[i] = in2[i];
    	}

    }
	public void bang()
	{
	}
    
	public void inlet(int i)
	{
	}
    
	public void inlet(float f)
	{
	}
    
    
	public void list(Atom[] list)
	{
	}
    
}





