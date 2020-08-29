"use strict";
exports.__esModule = true;
exports.Cleark = void 0;
var Cleark = /** @class */ (function () {
    function Cleark(name, age) {
        this.name = name;
        this.age = age;
    }
    Cleark.prototype.display = function () {
        console.log("Name:" + this.name + "\nAge: " + this.age);
    };
    return Cleark;
}());
exports.Cleark = Cleark;
