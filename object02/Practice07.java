package object02;

public class Practice07 {
	public static void main(String[] args) {
		int[] oldArr = {10,30,20};
		A03 a03 = new A03();
		int[] newArr = a03.copyArr(oldArr);

	}

}
class A03{
	public int[] copyArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < oldArr.length;i++) {
			newArr[i] = oldArr[i];
		}
		return newArr;
	}
}

	