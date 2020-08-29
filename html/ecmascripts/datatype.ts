class Emp
{
    public name:String;
    private age:number;
    constructor(name:String,age:number)
    {
        this.name=name;
        this.age=age;
    }
    show():any //can return anything
    {
        console.log("Name : "+this.name+"\nAge : "+this.age);
        return this.name; 
    }
}

class Cleark extends Emp
{
    id:number;
    constructor(name,age,id)
    {
        super(name,age);
        this.id;
    }
    show1()
    {
        console.log(name);
    }
}

var e =new Emp("Hari",20);
var e1 =new Emp("Prasad",22);
var s=e.show();
e1.show();
console.log(s);
var e2 =new Cleark("Prasad",22,1);
e2.show();
e2.show1();