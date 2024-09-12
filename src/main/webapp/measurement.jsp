<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Measurement Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    .form-container {
        width: 90%;
        max-width: 1200px;
        margin: 50px auto;
        background-color: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    .form-row {
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        gap: 15px;
        margin-bottom: 15px;
    }

    .form-row label {
        grid-column: span 1;
        text-align: right;
        margin-right: 10px;
        font-weight: bold;
        align-self: center;
        color: #007BFF; /* Blue color for labels */
    }

    .form-row input[type="text"] {
        grid-column: span 1;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    .form-title h1 {
        grid-column: span 4;
        text-align: center;
        font-size: 1.5em;
        margin: 20px 0;
        color: #007BFF; /* Blue color for titles */
    }

    .submit-row {
        display: flex;
        justify-content: center;
    }

    .submit-row input[type="submit"] {
        padding: 10px 20px;
        background-color: #007BFF; /* Blue background for submit button */
        border: none;
        border-radius: 4px;
        color: white;
        font-weight: bold;
        cursor: pointer;
    }

    .submit-row input[type="submit"]:hover {
        background-color: #0056b3; /* Darker blue on hover */
    }

    @media (max-width: 768px) {
        .form-row {
            grid-template-columns: 1fr;
        }

        .form-row label, .form-row input[type="text"] {
            grid-column: span 1;
            text-align: left;
        }

        .form-row label {
            margin-right: 0;
        }
    }
</style>
</head>
<body>
    <div class="form-container">
        <form action="receipt" method="post">
            <div class="form-row form-title">
                <h1>Shirt Measurement Form</h1>
            </div>

            <div class="form-row">
                <label>Customer ID:</label>
                <input type="text" name="customer_id" placeholder="Enter Customer ID" value="${param.id}" readonly>
            </div>
            <div class="form-row">
                <label>Chest:</label>
                <input type="text" name="shirt_chest" placeholder="Enter Chest Measurement">
                <label>Collar:</label>
                <input type="text" name="shirt_collar" placeholder="Enter Collar Measurement">
                <label>Hand Loose:</label>
                <input type="text" name="shirt_hand_loose" placeholder="Enter Hand Loose Measurement">
                <label>Height:</label>
                <input type="text" name="shirt_height" placeholder="Enter Height Measurement">
            </div>
            <div class="form-row">
                <label>Loose:</label>
                <input type="text" name="shirt_loose" placeholder="Enter Loose Measurement">
                <label>Other:</label>
                <input type="text" name="shirt_other" placeholder="Enter Other Measurements">
                <label>Press:</label>
                <input type="text" name="shirt_press" placeholder="Enter Press Preference">
                <label>Quantity:</label>
                <input type="text" name="shirt_quantity" placeholder="Enter Quantity">
            </div>
            <div class="form-row">
                <label>Rate:</label>
                <input type="text" name="shirt_rate" placeholder="Enter Rate" step="0.01">
                <label>Shape:</label>
                <input type="text" name="shirt_shape" placeholder="Enter Shape">
                <label>Shoulder:</label>
                <input type="text" name="shirt_shoulder" placeholder="Enter Shoulder Measurement">
                <label>Sleeve:</label>
                <input type="text" name="shirt_sleeve" placeholder="Enter Sleeve Measurement">
            </div>
            <div class="form-row">
                <label>Sleeve Cup:</label>
                <input type="text" name="shirt_sleeve_cup" placeholder="Enter Sleeve Cup Measurement">
                <label>Stomach:</label>
                <input type="text" name="shirt_stomach" placeholder="Enter Stomach Measurement">
                <label>Type:</label>
                <input type="text" name="shirt_type" placeholder="Enter Shirt Type">
            </div>

            <div class="form-row form-title">
                <h1>Pant Measurement Form</h1>
            </div>
            <div class="form-row">
                <label>Customer ID:</label>
                <input type="text" name="pant.customer_id" placeholder="Enter customer ID" value="${param.id}" readonly>
            </div>
            <div class="form-row">
                <label>Pant Height:</label>
                <input type="text" name="pant.pant_height" placeholder="Enter pant height">
                <label>Pant Knee:</label>
                <input type="text" name="pant.pant_knee" placeholder="Enter pant knee measurement">
                <label>Pant Legs Bottom:</label>
                <input type="text" name="pant.pant_legs_bottom" placeholder="Enter pant legs bottom">
                <label>Pant Other:</label>
                <input type="text" name="pant.pant_other" placeholder="Enter other pant measurements">
            </div>
            <div class="form-row">
                <label>Pant Pocket:</label>
                <input type="text" name="pant.pant_pocket" placeholder="Enter pant pocket details">
                <label>Pant Press:</label>
                <input type="text" name="pant.pant_press" placeholder="Enter pant press details">
                <label>Pant Quantity:</label>
                <input type="text" name="pant.pant_quantity" placeholder="Enter pant quantity">
                <label>Pant Rate:</label>
                <input type="text" name="pant.pant_rate" placeholder="Enter pant rate" step="0.01">
            </div>
            <div class="form-row">
                <label>Pant Seat:</label>
                <input type="text" name="pant.pant_seat" placeholder="Enter pant seat measurement">
                <label>Pant Shape:</label>
                <input type="text" name="pant.pant_shape" placeholder="Enter pant shape">
                <label>Pant Thigh:</label>
                <input type="text" name="pant.pant_thigh" placeholder="Enter pant thigh measurement">
                <label>Pant Tip:</label>
                <input type="text" name="pant.pant_tip" placeholder="Enter pant tip">
            </div>
            <div class="form-row">
                <label>Pant Type:</label>
                <input type="text" name="pant.pant_type" placeholder="Enter pant type">
                <label>Pant Waist:</label>
                <input type="text" name="pant.pant_waist" placeholder="Enter pant waist measurement">
            </div>

            <div class="form-row form-title">
                <h1>Receipt</h1>
            </div>
            <div class="form-row">
                <label>Current Date:</label>
                <input type="text" name="receipt.curr_date" placeholder="Enter current date">
                <label>Delivery Date:</label>
                <input type="text" name="receipt.delivery_date" placeholder="Enter delivery date">
                <label>Customer ID:</label>
                <input type="text" name="receipt.customer" placeholder="Enter customer ID" value="${param.id}" readonly>
                <label>Status:</label>
                <input type="text" name="receipt.status" placeholder="Enter status">
            </div>
            <div class="form-row">
                <label>Paid Amount:</label>
                <input type="text" name="receipt.paid_amount" placeholder="Enter paid amount">
            </div>

            <div class="form-row submit-row">
                <input type="submit" value="Submit">
            </div>
        </form>
    </div>
</body>
</html>
