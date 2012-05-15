import Sweets

class Liquorice(Sweets):

    price = 0.80
    name = "Sweet, Sweet Liquorice"

    def getPrice(amount = 1):
        return (Liquorice.price * amount)

print Liquorice.getPrice(8)
