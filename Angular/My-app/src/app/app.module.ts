import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'

import { AppComponent } from './app.component';
import { TestComponent } from './test/test.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './parent/child/child.component';
import { GrandhildldComponent } from './parent/child/grandhildld/grandhildld.component';
import { SiblingComponent } from './parent/child/grandhildld/sibling/sibling.component';
import { DataBindingComponent } from './data-binding/data-binding.component';

@NgModule({
  declarations: [
    AppComponent,
    TestComponent,
    ParentComponent,
    ChildComponent,
    GrandhildldComponent,
    SiblingComponent,
    DataBindingComponent
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
