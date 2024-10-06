import java.util.Arrays;
class NITcollecation
{
	private Object[] elementData;
	private int		elementcoutn;
	
		NITcollecation(){
			elementData = new Object[10];

		}
		public void add(Object obj){
			if (size()== capacity())
			{
				grow();
			}
			elementData[elementcoutn]= obj;
			elementcoutn++;
		}
		private void grow (){
			Object[] nextArray = new Object[capacity()*2];
			for (int i = 0;i<elementData.length;i++ )
			{
				nextArray[i] = elementData[i];
			}
			elementData = nextArray;
		}
		public int capacity(){
			return elementData.length;
		}
		public int size(){
			return elementcoutn;
		}
		 @Override
			public String toString(){
			return Arrays.toString(elementData);
			
		
			}
}