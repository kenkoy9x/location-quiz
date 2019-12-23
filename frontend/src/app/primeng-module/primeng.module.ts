import { NgModule } from '@angular/core';
import { TableModule } from 'primeng/table';
import { ButtonModule } from 'primeng/button';
import {InputTextModule} from 'primeng/inputtext';
import {DialogModule} from 'primeng/dialog';

@NgModule({
  imports: [
    TableModule,
    ButtonModule,
    InputTextModule,
    DialogModule
  ],
  exports: [
    TableModule,
    ButtonModule,
    InputTextModule,
    DialogModule
  ]
})
export class PrimeNGModule {
  constructor() {}
}
