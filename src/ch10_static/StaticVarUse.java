package ch10_static;

public class StaticVarUse {
	public static void main(String[] args) {
		System.out.println(StaticVar.a);
		StaticVar s = new StaticVar();
		System.out.println(s.b);
	}
}
