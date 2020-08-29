import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl:'./test.component.html' ,
  styles: ['./test.component.css']
})
export class TestComponent implements OnInit {
  sizeo="background-color:DodgerBlue";
  value1=true
  buttonv="button"
  name="Hari"
  state="Karnataka"
  sample=""
  message="Good Morning"
  constructor() { }
  inter():any{
    return this.message;
  }
  greeting(event)
  {
  console.log(event);
 //return this.sample="good morning"
return this.sample="Helo"
}
  ngOnInit(): void {
  }

}
