static package p1;							//package

static interface I{}
static abstract class AC{ }
static class CC{ }								//outer classes
static final class FC{ }
static enum E{}
static @interface A{ }

abstract class Test03{
	static Test03(){  }						//constructor

	static abstract void m1();			//abstract method

	void m2(static int p){					//parameter

		static int q = 20;						//local variable

		static{ }									//local block

		static class A{ }						//local inner classs

	}
}