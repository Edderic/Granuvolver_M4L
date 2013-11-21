import com.cycling74.max.*;
import com.cycling74.msp.*;
public class ComplexMultiplier extends MSPPerformer
{

	private static final String[] INLET_ASSIST = new String[]{
		"inlet 1 help"
	};
	private static final String[] OUTLET_ASSIST = new String[]{
		"outlet 1 help"
	};
	
	public ComplexMultiplier(Atom[] args)
	{
		// inputs: re1, im1, re2, im2
		// outputs: re, im
		declareInlets(new int[]{SIGNAL, SIGNAL, SIGNAL, SIGNAL, DataTypes.ALL});
		declareOutlets(new int[]{SIGNAL, SIGNAL, DataTypes.ALL});
		
		setInletAssist(INLET_ASSIST);
		setOutletAssist(OUTLET_ASSIST);

	}
    

    public void dspsetup(MSPSignal[] in, MSPSignal[] out) 
    {

    }

    public void perform(MSPSignal[] in, MSPSignal[] out)
    {
    	// Real and Imaginary.

    	float[] re_in1 = in[0].vec;
    	float[] im_in1 = in[1].vec;
    	float[] re_in2 = in[2].vec;
    	float[] im_in2 = in[3].vec;

    	float[] out1 = out[0].vec;
    	float[] out2 = out[1].vec;
    	int vec_size = in[0].n;

    	// Do complex multiplication.

    	float re_1st;
    	float im_1st;
    	float im_2nd;
    	float re_2nd;

    	for(int i = 0; i < vec_size; i++) {

    		re_1st = re_in1[i] * re_in2[i];
    		im_1st = re_in1[i] * im_in2[i];
    		im_2nd = im_in1[i] * re_in2[i];
    		re_2nd = im_in1[i] * im_in2[i];

    		out1[i] = re_1st - re_2nd;
    		out2[i] = im_1st + im_2nd;
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









