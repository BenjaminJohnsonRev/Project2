import { Timestamp } from "rxjs";
import { Sandwich } from "./sandwich";

export interface Cart{
    cart_id?:Number,
    customer_id?:Number,
    employee_id:Number,
    cost_sum:Number,
    cart_date?:Date,
    sandwiches?:Sandwich[]
}