# Tables

## **pizzas**

| id | name |
| - | - |
| 1 | Margarita |
| 2 | Pepperoni |

---

## **sizes**

| pizza_id | id | size_type | pizza_price |
| - | - | - | - |
| 1 | 1 | S | 20.00 |
| 1 | 2 | M | 21.00 |
| 1 | 3 | L | 22.00 |

---

## **order_sizes**

| size_id | order_id | id | size_count |
| - | - | - | - |
| 1 | 1 | 1 | 2 |
| 2 | 1 | 2 | 1 |

---

## **orders**

| id | client_name | client_phone | client_address | floor | status | created_at | updated_at | expected_at | token |
| - | - | - | - | - | - | - | - | - | - |
| 1 | John Smith | 123456789 | Street 123 | 0 |