package interface_inheritance;

// class implements interface
// interface extends interface
// class extends class

// interfaceC (�ڽ�) 
// --> interfaceA, interfaceB (�θ�)
// class implements interfaceC

public class ImplementClass implements InterfaceC {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - methodA");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - methodB");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("ImplementClass - methodC");
	}

}
