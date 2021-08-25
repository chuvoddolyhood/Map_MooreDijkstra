//Thuat toan Dijsktra tren bang do co huong thuc te
//Huong 2 chieu va 1 chieu

#include <stdio.h>
#define MAX 100
#define INFINITY 999999

typedef struct{
	int ver; //so dinh
	int array[MAX][MAX];
}Graph;

void create(Graph* G,int ver){
	int i, j;
	G->ver=ver; //luu so dinh doc trong FILE vo struct Graph
	for(i=1;i<=ver;i++){
		for(j=1;j<=ver;j++){
			G->array[i][j]=0;
		}
	}
}

void addGraph(Graph* G, int x, int y, int w){
	G->array[x][y]=w;
}

//Thuat toan Dijkstra 
int mark[MAX]; //danh dau dinh da xet - (1-da xet) (0-chua xet)
int p[MAX]; //tim dinh phia truoc dinh dang xet
int pi[MAX]; //tinh tong duong di giua 2 dinh

void Dijkstra(Graph* G, int s){
	int i, j, it;
	for(i=1;i<=G->ver;i++){
		mark[i]=0; //khoi tao mark
		pi[i]=INFINITY; //khoi tao pi[u]
	}
	
	//Xet diem can xet dau tien
	pi[s]=0;
	p[s]=-1;
	
	for(it=1;it<=G->ver;it++){
		//Tim dinh i co mark[i]==0 va pi[i] nho nhat
		int min_pi=INFINITY;
		for(j=1;j<=G->ver;j++){
			if(mark[j]==0 && pi[j]<min_pi){
				min_pi=pi[j];
				i=j;
			}
		}
		
		mark[i]=1; //da xet xong!!!
		printf("\n%-5d %d",p[i], i);
		
		for(j=1;j<=G->ver;j++){
			if(G->array[i][j]!=0&&mark[j]==0){
				if(pi[i]+G->array[i][j]<pi[j]){
					pi[j]=pi[i]+G->array[i][j];
					p[j]=i;
				}
			}
		}
	}
}


int main(){
	Graph G;
	int ver; //doc dinh FILE
	int edg; //doc cung FILE
	
	FILE *file=fopen("map1_demo.txt","r");
	fscanf(file,"%d%d",&ver,&edg);
	create(&G,ver);
	
	//Doc gia tri trong so cung
	int i;
	int x, y, w; //Doc gia tri trong FILE
	for(i=1;i<=edg;i++){
		fscanf(file,"%d%d%d",&x,&y,&w);
		addGraph(&G,x,y,w);
	}


	//In bang
	int a, b; //Bien ho tro tao bang
	for(a=1;a<=ver;a++){
		for(b=1;b<=ver;b++){
			printf("%5d",G.array[a][b]);
		}
		printf("\n");
	}
	
	printf("=========================================\n");
	Dijkstra(&G,8);
	printf("\n\n%d\n", pi[12]);

	return 0;
}
