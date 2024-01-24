import java.util.ArrayList;

/**
 * @author kfirs
 * 
 *
 */
public class SharedData 
{
	/**
	 * Class to share array within the threads
	 */
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** 	Constractor that get Array list and integers from the user 
	 * @param array     Array of integers
	 * @param b			the size of the array
	 */
	
	public SharedData(ArrayList<Integer> array, int b) {
		
		this.array = array;
		this.b = b;
	}

	/** get function of win array
	 * @return 	return the array of booleans
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}

	/** set function of win array
	 * @param winArray			array of booleans
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	/**get function of array of integers
	 * @return return the array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/** get function of array size
	 * @return  the size of array 
	 */
	public int getB() 
	{
		return b;
	}

	/** get functoin for flag
	 * @return 			booleans flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/** set function of flag
	 * @param flag  boolean flag
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
