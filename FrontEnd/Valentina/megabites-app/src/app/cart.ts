import { Timestamp } from "rxjs";

export interface Cart{
    cart_id?:Number,
    customer_id:Number,
    employee_id:Number,
    cost_sum:Number,
    cart_date?:Date
}