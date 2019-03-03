# CLASS Responsibility Collaborators(CRC)

| Table                           |                  |
| ------------------------------- |:-----------------:|
| Tables will contain the size    | WaitList Manager |
| and status. Its a subject that  |  			  |
| will notify its observers about |                  |
| status change.                  |                  |


| WaitList Manager               |                 |
| ------------------------------ |---------------|
| Manages the customer queue     | Customer Queue |
| Acts as an observer for tables |                |

| Customer Queue                |                  |
| ----------------------------- |:----------------:|
| Accept or refuse request for  | WaitList Manager |
| empty table.                  |                  |
| Request goes to next Customer |                  |
| in case of refusal            |                  |


# Design Patterns

### Observer Pattern:
Table class is the Subject here which has the WaitList Manager object attached to it as an observer. Whenever the table gets vacant, the waitlist manager is notified of the same, which then sends the notification to the customer class.

### Chain of responsibility Pattern:
The Customer Queue follows a chain a responsibility design pattern. The request is sent to the first customer in the queue by the manager, notifying the size of the table available. The customer can either accept or refuse the request. In case the customer denies, the request is then sent to the next customer in the queue and this goes on till any customer in the queue accepts the table.
