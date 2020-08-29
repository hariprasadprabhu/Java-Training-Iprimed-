let s1="Tata";
let s2="Tata";
/*
var promise=new Promise( function(resolve,reject)
			{
				if((s1+s2)=="TataTata")
					resolve();
				else
					reject();
			});
promise.then(()=>
	{
		console.log("resolved............");
	})
	.catch( ()=>
	{
		console.log("Rejected............");
	});
*/
/*
var promise=new Promise( function(resolve,reject)
			{
				if((s1+s2)=="Tatata")
					resolve();
				else
					reject();
			});
promise.then(()=>
	{
		console.log("resolved............");
	})
	.catch( ()=>
	{
		console.log("Rejected............");
	});
*/
/*
var promise=new Promise( function(resolve,reject)
			{
				if((s1+s2)=="TataTata")
					resolve();
				else
					reject();
			});
promise.then(()=>
	{
		console.log("resolved............");
		throw new Error("Success : some error occured");
	},
	()=>
	{
		console.log("Rejected............");
	})
	.catch( ()=>
	{
		console.log("Exception occured............");
	});

*/
/*
var promise=new Promise( function(resolve,reject)
			{
				if((s1+s2)=="TataTata")
					resolve();
				else
					reject();
			});
promise.then(()=>
	{
		console.log("resolved............");
		throw new Error("Success : some error occured");
	},
	()=>
	{
		console.log("Rejected............");
	})
	.catch( (err)=>
	{
		//console.log(err);
		console.log(err.message);
		console.log("Exception occured............");
	})
	.finally(
		()=>
		{
			console.log("Thank you");
		});
*/


var promise= new Promise(function(resolved,reject)
                                {
                                        if((s1+s2)==="TataTata")
                                        {        
                                                console.log("wait for 5 seconds");                                                
                                                setTimeout( ()=>resolved(10),5000
                                                        
                                                          )                        
                                        }
                                        else
                                        {        
                                                reject();
                                        }                                                                
                                }
                );

promise.then( (val)=>
                {
                        console.log("resolved..................");
                        console.log("Value::"+val);        
                        return val
                },
                ()=>
                {
                        console.log("rejected................");
                        throw new Error("Success : some error occured");
                }
        )
        .then( (val)=>
                {
                        console.log("resolved..................");
                        console.log("value::"+val);
                        throw new Error("Success : some error occured");
                }        
        )
        .catch(
                (err)=>
                {        
                        console.log(err.message);
                        console.log("Exception occered........");
                }
                        
        )
        .finally(
        
                ()=>
                {
                        console.log("Thank you");                
                }        
        )
        
console.log("this is non bocking application");        


//fullfilled/resolved,reject/pending/setteled        