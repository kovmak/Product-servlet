# Product Servlet

## Table of Contents

- [Overview](#overview)
- [Usage](#usage)
- [Contributions](#contributions)
- [License](#license)

## Overview
This project is a Java web application that demonstrates basic operations using servlets and JSP. It focuses on allowing users to create and list products, providing an example of how to manage data and sessions in a web application. Built with Tomcat, it illustrates the use of servlets for handling requests, JSP for rendering views, and session management for maintaining user state.
### Features
- **Product Management**: Add and list products through servlets.
- **Servlet Context Listener**: Initializes product data on application startup.
- **JSP Rendering**: Uses JSP for dynamic web page content.
- **Session Tracking**: Demonstrates session handling and request information.

## Usage
1. **Setup and Deployment**:
    - Clone the repository to your local machine.
    - Build and deploy the application to Tomcat or Wildfly.

2. **Access the Application**:
    - Open your web browser and navigate to `http://localhost:8080/Product-servlet/simpleHttp` to view the request information.
    - Navigate to `http://localhost:8080/Product-servlet/product-list` to view the list of products.

3. **Interacting with the Application**:
    - Use the `/simpleHttp` endpoint to see request details such as context path, servlet path, and session counter.
    - Use the `/product-list` endpoint to view and manage the list of products.

## Contributions
Contributions, feedback, and suggestions are welcome. If you have any improvements or find issues, please submit a pull request or open an issue.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
