export interface Sandwich {
    cart_id?: number,
    cost: number,
    cart_date: Date,
    sandwiches: [
        {
            "sandwich_id": number,
            "bread": {
                "id": number,
                "name": string,
                "price": number
            },
            "meat": {
                "id": number,
                "name": string,
                "price": number
            },
            "vegetable": {
                "id": number,
                "name": string,
                "price": number
            },
            "sauce": {
                "id": number,
                "name": string,
                "price": number
            },
            "seasoning": {
                "id": number,
                "name": string,
                "price": number
            }
        }
    ]
}
