public class Calculate{
	private int result;
	
	public void add(int... params){
		for(Integer param: params) {
			this.result += param;
		}
	}
	public void minus(int... params) {
		for (Integer param : params) {
			this.result -= param;
		}
	}

	public void multipliy(int... params) {
			this.result = params[0]*params[1];
	}

	public void devide(int... params) {
		this.result = params[0]/params[1];
	}

	public int getResult(){
	  return this.result;
	}

	public void clearResult(){
	  this.result = 0;
	}
}