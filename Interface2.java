//one class can extend another class

class Base
{}

class Derived extends Base
{}

///////////////////////////////////////////////////

//one class can implement one interface

interface Demo
{}

class Test implements Demo
{}
///////////////////////////////////////////////////

//one class can implement more than one interface

interface Demo
{}

interface Test
{}

class Result implements Demo,Test
{}
///////////////////////////////////////////////////

//one interface can extends another interface

interface Demo
{}

interface Test extends Demo
{}

class Result implements Test
{}
///////////////////////////////////////////////////

//one class can extend another class and implements one interface

interface Demo
{}

class Test
{}

class Result extends Test implements Test
{}

///////////////////////////////////////////////////