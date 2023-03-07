package ChainOfResponsiblityPattern.src.demo0.before;

public class Manager {
	 protected string name;

     public Manager(string name)
     {
         this.name = name;
     }

     //�õ����
     public void GetResult(ManagerLevel managerLevel, Request request)
     {
         if (managerLevel == ManagerLevel.����)
         {
             if (request.RequestType == "���" && request.Number <= 2)
             {
                 Console.WriteLine("{0}:{1} ����{2} ����׼", name, request.RequestContent, request.Number);
             }
             else
             {
                 Console.WriteLine("{0}:{1} ����{2} ����Ȩ����", name, request.RequestContent, request.Number);
             }

         }
         else if (managerLevel == ManagerLevel.�ܼ�)
         {
             if (request.RequestType == "���" && request.Number <= 5)
             {
                 Console.WriteLine("{0}:{1} ����{2} ����׼", name, request.RequestContent, request.Number);
             }
             else
             {
                 Console.WriteLine("{0}:{1} ����{2} ����Ȩ����", name, request.RequestContent, request.Number);
             }
         }
         else if (managerLevel == ManagerLevel.�ܾ���)
         {
             if (request.RequestType == "���")
             {
                 Console.WriteLine("{0}:{1} ����{2} ����׼", name, request.RequestContent, request.Number);
             }
             else if (request.RequestType == "��н" && request.Number <= 500)
             {
                 Console.WriteLine("{0}:{1} ����{2} ����׼", name, request.RequestContent, request.Number);
             }
             else if (request.RequestType == "��н" && request.Number > 500)
             {
                 Console.WriteLine("{0}:{1} ����{2} ��˵��", name, request.RequestContent, request.Number);
             }
         }

     }
}
