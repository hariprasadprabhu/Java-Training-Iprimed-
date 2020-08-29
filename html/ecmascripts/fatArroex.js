function add(a, b) {
    return a + b;
}
var res = function (x, y) { return x * y; };
console.log(add(10, 20));
console.log(res(10, 20));
var Person = /** @class */ (function () {
    function Person() {
        this.name = "Hari";
        console.log("from the person " + this.name);
        //function within a function
        var self = this.name;
        setTimeout(function () {
            console.log("from function " + self);
            console.log("from function " + this.name);
        }, 5000);
    }
    return Person;
}());
new Person();
var Person1 = /** @class */ (function () {
    function Person1() {
        var _this = this;
        this.name = "Hari";
        console.log("from the person " + this.name);
        //function within a function
        setTimeout(function () {
            console.log("from function " + _this.name);
        }, 5000);
    }
    return Person1;
}());
new Person1();
