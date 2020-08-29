import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GrandhildldComponent } from './grandhildld.component';

describe('GrandhildldComponent', () => {
  let component: GrandhildldComponent;
  let fixture: ComponentFixture<GrandhildldComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GrandhildldComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GrandhildldComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
