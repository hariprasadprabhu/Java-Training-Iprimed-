function add(a,b)
{
 return a+b;
}

var res=(x,y)=>x*y;

console.log(add(10,20));
console.log(res(10,20));

class Person
{
name="Hari";
constructor()
{
console.log("from the person "+this.name);
//function within a function
var self=this.name;
setTimeout(function(){
	console.log("from function "+self);
	console.log("from function "+this.name);
},5000);
}
}
new Person();



class Person1
{
name="Hari";
constructor()
{
console.log("from the person "+this.name);
//function within a function
setTimeout(()=>{
	console.log("from function "+this.name); //arrow fuction will help to access the upper functions this key word
},5000);
}
}
new Person1();