import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ListComponent} from "./component/hoatdong/list/list.component";
import {CreateComponent} from "./component/hoatdong/create/create.component";
import {StatisticComponent} from "./component/hoatdong/statistic/statistic.component";
import {UpdateComponent} from "./component/hoatdong/update/update.component";


const routes: Routes = [
  {path: '', component: ListComponent},
  {path: 'create', component: CreateComponent},
  {path: 'statistic', component: StatisticComponent},
  {path: 'update/:maHD', component: UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
