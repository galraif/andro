function Person(name, age) {
    this.name = name || "John Doe";
    this.age = age || 0;
}

Person.prototype.greet = function() {
    return "Good Afternoon " + this.name;
};

Person.prototype.life = function() {
    if (this.age <= 0)
        return "Quite young, I mus say!"
    
    return this.age;
}

var me= new Person("Me");