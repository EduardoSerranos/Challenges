const GadgetGalaxyDB = db.getSiblingDB('gadgetStore');
GadgetGalaxyDB.createCollection('products', {
    validator:{
        $jsonSchema:{
            bsonType: "object",
            required: ["name", "price", "inStock"],
            properties: {
                name: {
                    bsonType: "string",
                    description: "must be a string and is required"
                },
                price: {
                    bsonType: ["int", "double"],
                    description: "must be a double and is required"
                },
                inStock: {
                    bsonType: "boolean",
                    description: "must be a boolean and is required"
                }
            }
        }
    },
    validationAction: "error"
});

GadgetGalaxyDB.products.insertMany([
    { name : 'Nvidia RTX5090', price: 5999.99, inStock: true, specs: {brand: "Nvidia"}},
    { name : 'Nvidia RTX5080', price: 1399.99, inStock: true, specs: {brand: "Nvidia"}},
    { name : 'RedDragon Gaming mouse', price: 19.99, inStock: true, specs: {brand: "RedDragon"}}
]);

GadgetGalaxyDB.products.insertOne({
    name: '4k OLED 240 Hz Gaming Monitor', inStock:true
});

GadgetGalaxyDB.products.updateOne(
    {name: 'Nvidia RTX5090'},
    { $inc: { price:15 }}
);

GadgetGalaxyDB.products.updateOne(
    {name: 'Nvidia RTX5090'},
    { $set: {category: "Accessories"}}
);


GadgetGalaxyDB.products.updateOne(
    {name: 'RedDragon Gaming mouse'},
    { $push: { tags: "wireless"}}
);

GadgetGalaxyDB.products.updateOne(
    {name: 'RedDragon Gaming mouse'},
    { $push: { tags: "bestseller"}}
);

GadgetGalaxyDB.products.updateOne(
    {name: 'RedDragon Gaming mouse'},
    { $pull: { tags: "wireless"}}
);

GadgetGalaxyDB.products.find(
    { price: { $gte: 500}}
);

GadgetGalaxyDB.products.find(
    { "specs.brand":"RedDragon"}
);

GadgetGalaxyDB.products.find({
    category: { $in: ["electronics, clothing"]}
    });

GadgetGalaxyDB.createCollection("orders");

GadgetGalaxyDB.orders.insertOne({
    productId: ObjectId("68d123456789abcdef123456"),
    quantity: 2
});

GadgetGalaxyDB.orders.aggregate([
    {
        $lookup: {
            from: "products",
            localfield: "productId",
            foreignfield: "_id",
            as: "product"
        }
    },
    {
        $unwind:"$product"
    },
    {
        $project: {
            _id: 0,
            productName: "$product.name",
            quantity: 1
        }
    }
]);


