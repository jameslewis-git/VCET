if __name__ == '__main__':
    with open ('C:\\Users\\James Lewis\\Desktop\\Python\\Experiment 03\\file.txt', 'r') as file:
        lines = file.readlines ()
        numberOfLines = len (lines)
        numberOfWords = sum (len (line.split()) for line in lines)
        
        # Write numberOfCharacters over here.
        numberOfCharacters = ''
        
    print(f"Lines: {numberOfLines}")
    print(f"Words: {numberOfWords}")
    print(f"Characters: {numberOfCharacters}")