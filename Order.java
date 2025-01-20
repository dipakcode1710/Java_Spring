//Let’s say you’re working with an order processing system, and you need to represent the different statuses of an order.

// Defining the Enum
enum OrderStatus {
    PENDING, 
    PROCESSING, 
    SHIPPED, 
    DELIVERED, 
    CANCELED
}

// Using the Enum
public class Order {
    private int orderId;
    private OrderStatus status;

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Status: " + status);
    }

    public static void main(String[] args) {
        // Create an order
        Order order = new Order(123, OrderStatus.PENDING);
        order.printOrderDetails();

        // Update the order status
        order.setStatus(OrderStatus.PROCESSING);
        System.out.println("\nAfter updating status:");
        order.printOrderDetails();
    }
}
