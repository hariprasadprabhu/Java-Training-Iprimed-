/*var abc=function()
	{
		console.log("abc");
	}
var xyz=function()
	{
		console.log("xyz");
	}
function demo(op1,op2)
	{
		console.log("from demo");
		op1();
		op2();
	}
demo(abc,xyz);*/

var abc=function()
	{
		console.log("abc");
	}
var xyz=function()
	{
		console.log("xyz");
	}
function demo(...op)
	{
		console.log("from demo");
		for(var i=0;i<op.length;i++)
		{
			op[i]();
		}
	}
demo(abc,xyz,abc,xyz,xyz,abc,xyz);