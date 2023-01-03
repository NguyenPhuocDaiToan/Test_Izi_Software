import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListComponent } from './component/hoatdong/list/list.component';
import {HttpClientModule} from "@angular/common/http";
import { CreateComponent } from './component/hoatdong/create/create.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { StatisticComponent } from './component/hoatdong/statistic/statistic.component';
import { UpdateComponent } from './component/hoatdong/update/update.component';
import { HeaderComponent } from './component/common/header/header.component';
import { FooterComponent } from './component/common/footer/footer.component';

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    CreateComponent,
    StatisticComponent,
    UpdateComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
