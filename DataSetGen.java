

public class DataSetGen <T extends Measurable> {


	private T maximum;
	private double sum;
	private int count;

	public DataSetGen () {

		maximum=null;
		sum=0;
		count=0;
	}

	public void add(T x)
	{
		sum = sum + x.getMeasure();
		if (count == 0 || maximum.getMeasure() < x.getMeasure())
			maximum = x;
		count++;

	}

	public double getAverage() {

		if (count ==0)return 0;
		else return sum/count;
	}



	public T getMaximum() {

		return maximum;



	}

}