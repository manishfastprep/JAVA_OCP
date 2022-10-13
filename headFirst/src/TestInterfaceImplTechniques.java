public class TestInterfaceImplTechniques
{
	
}
interface I1
{
	public void method1();
	public void method2();
}
abstract class I1AbstractImpl implements I1
{
	public void method2(){}	
}
class I1Impl extends I1AbstractImpl
{
	public void method1()
	{}
}
class I1Imp2 extends I1AbstractImpl
{
	public void method1()
	{}
}
class I1Imp3 extends I1AbstractImpl
{
	public void method1()
	{}
}