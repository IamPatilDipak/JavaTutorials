**Java IO**

Provides for system input and output through data streams, serialization and the file system.

***Package java.io***


The Java IO package is primarily focused on input and output to files, network streams, internal memory buffers etc. 
However, the Java IO package does not contain classes to open network sockets which are necessary for network communication. 
For that purpose you need to use the ***Java Networking API***. Once you have opened a socket (network connection) though, 
you read and write data to and from it via Java IO's ***InputStream and OutputStream classes***.

 

**Java NIO - The Alternative IO API**

Java also contains another IO API called Java NIO. It contains classes that does much of the same as the Java IO 
and Java Networking APIs, but Java NIO can work in ***non-blocking mode***. Non-blocking IO can in some situations 
give a big performance boost over blocking IO. 



**Streams**

***IO Streams*** are a core concept in Java IO. A stream is a conceptually endless flow of data. 
You can either read from a stream or write to a stream. A stream is connected to a data source or a data destination. 
Streams in Java IO can be either byte based (reading and writing bytes) or character based (reading and writing characters). 


**Java IO Purposes and Features**

Java IO contains many subclasses of the ***InputStream, OutputStream, Reader and Writer classes***. 
The reason is, that all of these subclasses are addressing various different purposes. 
That is why there are so many different classes. The purposes addressed are summarized below: 

1.  File Access
2.  Network Access
3.  Internal Memory Buffer Access
4.  Inter-Thread Communication (Pipes)
5.  Buffering
6.  Filtering
7.  Parsing
8.  Reading and Writing Text (Readers / Writers) 
9.  Reading and Writing Primitive Data (long, int etc.)
10. Reading and Writing Objects

**Byte Based Input Output**

Basic - InputStream - OutputStream

Arrays - ByteArrayInputStream - ByteArrayOutputStream

Files - FileInputStream - RandomAccessFile - FileOutputStream - RandomAccessFile

Pipes - PipedInputStream - PipedOutputStream

Buffering - BufferedInputStream - BufferedOutputStream

Filtering - FilterInputStream - FilterOutputStream

Parsing - PushbackInputStream - StreamTokenizer

Data - DataInputStream - DataOutputStream

Data Formatted - PrintStream

Objects - ObjectInputStream - ObjectOutputStream

Utilities - SequenceInputStream

**Character Based Input Output**

Basic - Reader - InputStreamReader - Writer - OutputStreamWriter

Arrays - CharArrayReader - CharArrayWriter

Files - FileReader - FileWriter

Pipes - PipedReader - PipedWriter

Buffering - BufferedReader - BufferedWriter

Filtering - FilterReader - FilterWriter

Parsing - PushbackReader - LineNumberReader

Strings - StringReader - StringWriter

Data Formatted - PrintWriter