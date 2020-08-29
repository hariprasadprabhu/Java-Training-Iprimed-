import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'databinding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {
bank ="SBI";
year=2020;
name="Hari"
property="button";
trueOrFalse=false;
isavail:String=""
login:String="";
  constructor() { }

  ngOnInit(): void {
  }

  goto(val){
      console.log(val);
      this.isavail="Welcome Mr./Ms "+val;
  }
  abc(val)
  {
    console.log(this.login=val);

  }
  

}
