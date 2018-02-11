


/**
 * 
 * Q3:
 * A).
 * 		Using tree representation implement the process below：
		 * 							␣ （Root）
		 * 							|	
		 * 							|
 * First level：	         ■ ▲					■ ■
 * 							|					|
 * 							|					|
 * Second level：	▲●▲		smile▲	cry▲	■▲■	  ■●■	■No emotion    ■cry		....	(This level extend from ■ ▲) 
 * 			 		▲●■		smile■	cry■	.....................				(This level extend from ■ ■)
 * 
 * the rest level can be done in the same manner...
 * 
 * 
 * We search each  time，can decide if this extend the purpose emojis which are 【smile，cry，no emotion，cary，smile】，this status，thats the conclusion we got， the depth of the tree is the smallest steps we need.
 * 
 * 
 * 
 * B).
 * This must be the（optimal-substructure），Because we first get some status，so,that status must be the first arrive place.
 * Because we serach this level by level，This is like the (BFS) algorithm.
 * 
 * C)Design the details，First, the whole search process，we can use a (queue) to represent，
 * 		At the beginning，add 【␣】 in queue，
 * 		Every time we take a element from queue，then, extend it，we determin the result of extension，if the results same with the staus we want，thats means we get the solution, output it.
 * 		if the length of element bigger than five, thats means the status is a null status，we dont consider it.
 * 		if thats empty queue，thats means we cannot get the status we want.
 * 
 * E)
 *		pseudocode 		
 * 		BFS():											//use BFS
 * 			queue.push('␣')								//add start to queue
 * 			
 * 			while(!queue.isempty)						//if empty break
 * 				start = queue.pop()						//take every header, become the start point
 * 				for every condition:					//consider evry condition
 * 					end = start.expand()				//extend id
 * 					if(end == aim)						//get the aim point 
 * 						print result and exit.			//output
 * 			
 * 			if(queue.isempty)							//if queue empty couldnt get the solu
 * 				print no result							//no result
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








