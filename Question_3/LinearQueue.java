package Question_3;


public class LinearQueue {
        private ArrayStack stack1;
        private ArrayStack stack2;


        public QueueUsingStacks(int capablity) {
            this.stack1 = new ArrayStack(capability);
            this.stack2 = new ArrayStack(capability);
        }
        public void enqueue(int element) {
            stack1.push(element);
        }
        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

    }
}
