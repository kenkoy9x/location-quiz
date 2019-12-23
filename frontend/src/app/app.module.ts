import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AppComponent } from './app.component';
import { LocationComponent } from './pages/location/location.component';
import { LocationService } from './services/location.service';
import { PrimeNGModule } from './primeng-module';

@NgModule({
  declarations: [
    AppComponent,
    LocationComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule,
    PrimeNGModule,
    ReactiveFormsModule
  ],
  exports: [
    PrimeNGModule
  ],
  providers: [LocationService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
