import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {TripListComponent} from './components/trip-list/trip-list.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatCardModule} from "@angular/material/card";
import {HttpClientModule} from "@angular/common/http";
import {MatButtonModule} from "@angular/material/button";
import { HeaderComponent } from './components/header/header.component';
import { NavigationComponent } from './components/navigation/navigation.component';
import {MatButtonToggleModule} from "@angular/material/button-toggle";
import { AboutusComponent } from './components/aboutus/aboutus.component';

@NgModule({
  declarations: [
    AppComponent,
    TripListComponent,
    HeaderComponent,
    NavigationComponent,
    AboutusComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MatCardModule,
    HttpClientModule,
    MatButtonModule,
    MatButtonToggleModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
