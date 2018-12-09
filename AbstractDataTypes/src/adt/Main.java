package adt;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayStack<Integer> st=new ArrayStack<Integer>(5);
st.push(5);
st.push(6);
st.push(7);
st.push(8);
st.push(9);
System.out.print(st.pop());

System.out.print("After removing: "+st.top());

System.out.print("After removing: "+st.toString());
	}

}
