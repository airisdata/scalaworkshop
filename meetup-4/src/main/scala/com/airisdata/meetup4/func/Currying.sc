// A normal function which takes 3 int arguments and sum the arguments
def func(a:Int, b:Int, c:Int): Int = a + b + c
val result1: Int = func(1,2,3)


// A curried function which is very similar to above function but arguments are curried
// which mean if you have a function which have 3 arguments and if you choose to provide only 1 argument
// then it result in another function which need 2 more arguments
def cfunc(a:Int)(b:Int)(c:Int): Int = a + b + c
// ========  PROVIDE ONLY 1 ARGUMENT ======//
// Applied only 1 argument which returns a function which needs two more arguments
val partialFunction1: (Int) => (Int) => Int = cfunc(1)
// Apply missing 2 arguments and we have complete method definition
val result2: Int = partialFunction1(2)(3)


// ========= PROVIDE ONLY 2 ARGUMENTS ====//
// Applied only 2 arguments which return a function which need 1 more argument
val partialFunction2: (Int) => Int = cfunc(1)(2)
// Apply the missing 1 argument
val result3: Int = partialFunction2(3)


//======== PROVIDE ALL 3 ARGUMENTS =====//
val fullyAppliedFunction: Int = cfunc(1)(2)(3)


val pfunction: (Int) => (Int) => Int = cfunc(1)