import socket  # Importing socket module for networking
import threading  # Importing threading module to handle multiple clients

# Define server configuration
PORT = 5050  # Port number on which the server will listen
SERVER = socket.gethostbyname(socket.gethostname())  # Automatically get local IP address
ADDR = (SERVER, PORT)  # Combine IP and port into a tuple
FORMAT = 'utf-8'  # Encoding format for messages
HEADER = 64  # Fixed header size to store message length
DISCONNECT_MESSAGE = '!DISCONNECT'  # Command to disconnect the client

# Create a socket for the server (IPv4, TCP)
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(ADDR)  # Bind the server to the specified address and port

def clientHandling(connection, address):
    """
    Handles communication with a connected client.

    Parameters:
    - connection: The socket object for client-server communication
    - address: The client's address (IP and port)
    """
    print(f'[NEW CONNECTION] {address} connected')
    isConnected = True

    while isConnected:
        # Receive the message length (first HEADER bytes)
        messageLength = connection.recv(HEADER).decode(FORMAT)

        if messageLength:
            messageLength = int(messageLength)  # Convert length to integer
            message = connection.recv(messageLength).decode(FORMAT)  # Receive actual message

            if message == DISCONNECT_MESSAGE:  # Check if the client wants to disconnect
                isConnected = False

            print(f'[{address}] {message}')  # Print the received message
            connection.send('Message Received'.encode(FORMAT))  # Acknowledge receipt

    connection.close()  # Close the client connection when loop ends

def start():
    """
    Starts the server and listens for incoming connections.
    """
    server.listen()  # Start listening for client connections
    print(f'[LISTENING] Server is listening on {SERVER}')

    while True:
        # Accept a new client connection
        connection, address = server.accept()
        
        # Create a new thread for handling this client
        thread = threading.Thread(target=clientHandling, args=(connection, address))
        thread.start()

        # Print the number of active connections (excluding the main thread)
        print(f'[ACTIVE CONNECTIONS] {threading.active_count() - 1}')

# Start the server
print('[SERVER STARTING] Server has been started')
start()
