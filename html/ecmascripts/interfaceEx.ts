interface Car
{
    name:String;
    model:String;
    price:number;
    speakers?:String;

    speed():void;
}

class BMW implements Car
{
    name="BMW";
    model="BM-2";
    price=20000000;
    speakers="JBL";
    speed():void
    {
        console.log(" displaying Speed is 500kmph");
    }
}

interface abc extends BMW // Not in java
{

}

class AUDI implements Car
{
    name="Audi";
    model="A-2";
    price=10000000;
    speed():void
    {
        console.log("Speed is 400kmph");
    }
}

let bmw= new BMW();
bmw.name=""
let audi= new AUDI();

let c1:Car=("name":"Swift","model":"dzire","price":1000,"speaker":"Boat");