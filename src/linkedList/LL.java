package linkedList;

public class LL {
	public NODE head;	
	public NODE tell;
	public int size;
	
			class NODE{
				int value;
				NODE next;
				
				public NODE(int v) {
					this.value=v;
				}
			}
			
			//ADD Element in First position
			public void addFirst(int value) {
				
				NODE node=new NODE(value);
				
				if(head==null && tell==null) {
					
					head=node;
					tell=node;
				
				}else {
					
					node.next=head;
					head=node;
					
				}
				
				size++;
				
			}
			//Add element to the last last
			public void addToLast(int value) {
NODE node=new NODE(value);
				
				if(head==null && tell==null) {
					
					head=node;
					tell=node;
				
				}else {
					
					tell.next=node;
					tell=node;
					
				}
				
				size++;
				
			}
		//Add in the ,middle-----
			public void addInPosition(int value,int location) {
				if((location-2)>size) {
					System.out.println("Postion not possible ");
					return;
				}
				if(head==null && tell==null) {
					addToLast(value);
					return;
				}else if(location==0) {
					addFirst(value);
					return;
				}
				int i=0;
				NODE lastNode=head;
				NODE prvNode=null;
				while(i<location) {
					i++;
					prvNode=lastNode;
					lastNode=lastNode.next;
					
				}
				NODE n= new NODE(value);
				prvNode.next=n;
				n.next=lastNode;
				size++;
			}
			
			//Display List;
			public void display() {
				NODE temp=head;
				while(temp!=null) {
					System.out.print(temp.value+"---->");
					temp=temp.next;
				}
				System.out.print("NULL");
			}
			//Size 
			public int getSize() {
				return this.size;
			}

}
