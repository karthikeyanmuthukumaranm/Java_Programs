import tkinter as tk
from tkinter import messagebox

def add_task():
    tasks=entry.get()
    if tasks:
        list_tasks.insert(tk.END,tasks)
        entry.delete(0,tk.END)
    else:
        messagebox.showerror("please add task !")

def delete_tasks():
    try:
        select_index=list_tasks.curselection()[0]
        list_tasks.delete(select_index)
    except IndexError:
        messagebox.showwarning("select task to remove it")

root=tk.Tk()
root.title("to-do lists")
root.geometry("400x300")

label=tk.Label(root, text="to-do-lists" ,font=("Arial" , 15))
label.pack(pady=5)

entry=tk.Entry(root , width=40)
entry.pack(pady=5)

list_tasks=tk.Listbox(root,width=40,height=20)
list_tasks.pack(pady=5)

button_add=tk.Button(root,text="add task" ,command=add_task)
button_add.pack(pady=3)

button_remove=tk.Button(root, text="Delete task" ,command=delete_tasks)
button_remove.pack(pady=3)

root.mainloop()