function Activity(amount) {
  this.amount = amount;
}

Activity.prototype.setAmount = function (value) {
  if (value <= 0) {
    return false;
  } else {
    this.amount = value;
    return true;
  }
};

Activity.prototype.getAmount = function () {
  return this.amount;
};

function Payment(amount, receiver) {
  Activity.call(this, amount);
  this.receiver = receiver;
}

Payment.prototype = Object.create(Activity.prototype);
Payment.prototype.constructor = Payment;

Payment.prototype.setReceiver = function (receiver) {
  this.receiver = receiver;
};

Payment.prototype.getReceiver = function () {
  return this.receiver;
};

function Refund(amount, sender) {
  Activity.call(this, amount);
  this.sender = sender;
}

Refund.prototype = Object.create(Activity.prototype);
Refund.prototype.constructor = Refund;

Refund.prototype.setSender = function (sender) {
  this.sender = sender;
};

Refund.prototype.getSender = function () {
  return this.sender;
};

// Example usage
let payment = new Payment(100, "John Doe");
console.log(payment.getAmount());
console.log(payment.getReceiver());

let refund = new Refund(50, "Jane Doe");
console.log(refund.getAmount());
console.log(refund.getSender());
