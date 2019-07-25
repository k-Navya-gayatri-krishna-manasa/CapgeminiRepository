import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { ShowComponent } from './app.showcomponent';
import { HttpClientModule } from '@angular/common/http';
import { AddemployeeComponent } from './addemployee/addemployee.component';
import {FormsModule} from '@angular/forms';

@NgModule({
    imports: [
        BrowserModule,
        HttpClientModule,
        FormsModule
       
    ],
    declarations: [
        AppComponent,
        ShowComponent,
        AddemployeeComponent		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }